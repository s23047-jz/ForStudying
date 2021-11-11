import asyncio

import discord
from discord.ext import commands, tasks
import youtube_dl
import os
from dotenv import load_dotenv
from discord_slash import

load_dotenv()

intents = discord.Intents().all()
client = discord.Client(intents=intents)
bot = commands.Bot(command_prefix='/', intents=intents)
command = []

youtube_dl.utils.bug_reports_message = lambda: ''

ytdl_format_option = {
    'format': 'bestaudio/best',
    'restrictfilenames': True,
    'noplaylist': True,
    'nocheckcertificate': True,
    'ignoreerrors': False,
    'logtostderr': False,
    'quiet': True,
    'no_warnings': True,
    'default_search': 'auto',
    'source_address': '0.0.0.0' # bind to ipv4 since ipv6 addresses cause issues sometimes
}

ffmpeg_option = {
    'options': '-vn'
}

ytdl = youtube_dl.YoutubeDL(ytdl_format_option)

class YTDLSource(discord.PCMVolumeTransformer):
    def __init__(self, source, *, data, volume=.5):
        super().__init__(source, volume)
        self.data = data
        self.title = data.get('title')
        self.url = ""

    @classmethod
    async def from_irl(cls, url, *, loop=None, stream=False):
        loop = loop or asyncio.get_event_loop()
        data = await loop.run_in_executor(None, lambda: ytdl.extract_info(url, download=not stream))
        if 'entries' in data:
            data = data['entries'][0]
        file_name = data['title'] if stream else ytdl.prepare_filename(data)
        return file_name


@bot.command(name='play_song', help='To play song')
async def play(ctx, url):
    if not ctx.message.author.name=='Rohan Krishna':
        await ctx.send('NOT AUTHORISED!')
        return
    try:
        server = ctx.message.guild
        voice_chanel = server.voice_client

        async with ctx.typing():
            file_name = await YTDLSource.from_irl(url, loop=bot.loop)
            voice_chanel.play(discord.FFmpegPCMAudio(executable='ffmpeg.exe', source=file_name))
        await ctx.send('**Now playing**: {}'.format(file_name))
    except:
        await ctx.send('The bot is not connected to vc!')


command[0] = play()



client.run(os.getenv('TOKEN'))
