import NextLink from 'next/link';

import { Container, Box, Heading, Image, useColorModeValue, Button, Link } from '@chakra-ui/react';
import { ChevronRightIcon } from '@chakra-ui/icons';

import Section from '../components/section';
import Paragraph from '../components/paragraph';
import Layout from '../components/layouts/article';


const Page = () => {
  return (
    <Layout>
      <Container>
        {/* alignIntems mozna napisac w skrocie jako align */}
        <Box borderRadius='lg' bg={useColorModeValue('whiteAlpha.500', 'whiteAlpha.200')} p={3} mb={6} align='center'>
          Hello, I am a beggining full-stack developer!
        </Box>
        {/* d od display */}
        <Box d={{ md: 'flex' }}>
          <Box flexGrow={1}>
            <Heading as='h2' variant='page-title'>
              Jacob
            </Heading>
          </Box>
          <Box flexShrink={0} mt={{ base: 4, md: 0 }} ml={{ md: 6 }} align='center'>
            <Image borderColor="whiteAlpha.800" borderWidth={2} borderStyle='solid' maxWidth='100px' display='inline-block' borderRadius='full' src='/images/cat.png' alt='Profile image' />
          </Box>
        </Box>
        <Section delay={0.1}>
          <Heading as='h3' variant='section-title'>
            About
          </Heading>
          <Paragraph>
            I am a second-year student of computer science at the Polish-Japanese Academy of Information Technology. Building digital services / things I want (sometimes just for fun 😊, or for the completion of my knowledge) is my passion. When I'm finished with work, I enjoy spending time with my friends, playing computer games to relax, cooking or listening to music.
          </Paragraph>
          <Box align="center" my={4}>
            <NextLink href="/works">
              <Button rightIcon={<ChevronRightIcon />} colorScheme="blue">
                My portfolio
              </Button>
            </NextLink>
          </Box>
        </Section>
        <Section delay={0.3}>
          <Heading as="h3" variant="section-title">
            I ♥
          </Heading>
          <Paragraph>
            Music, Drawing, Playing Games, Cafe Art, Creating an applications and websites, Cloud architecting.
          </Paragraph>
        </Section>
      </Container>
    </Layout>
  );
}

export default Page;