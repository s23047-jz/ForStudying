import NextLink from 'next/link';

import { Container, Box, Heading, Image, useColorModeValue, Button, SimpleGrid } from '@chakra-ui/react';
import { ChevronRightIcon } from '@chakra-ui/icons';

import Section from '../components/section';
import Paragraph from '../components/paragraph';
import Layout from '../components/layouts/article';
import { SkillGridItem } from '../components/skill-grid';
import { WorkGridItem } from '../components/grid-item';
import { Breaker } from '../components/breaker';

import { skills } from "../constants/skills";

import thumbToDodrop from '../public/images/works/1.jpg';
import thumbPostdrop from '../public/images/works/2.jpg';
import thumbPortfoliodrop from '../public/images/works/3.jpg';
import thumbChatAppdrop from '../public/images/works/4.jpg';


const Page = () => {
  return (
    <Layout>
      <Container>
        {/* alignIntems mozna napisac w skrocie jako align */}
        <Box borderRadius='lg' bg={useColorModeValue('blue.500', 'blue.200')} p={3} mb={6} align='center'>
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
        <Breaker />
        <Section delay={0.1}>
          <Heading as='h3' variant='section-title'>
            About
          </Heading>
          <Paragraph>
            I am a second-year student of computer science at the Polish-Japanese Academy of Information Technology. Building digital services / things I want (sometimes just for fun 😊, or for the completion of my knowledge) is my passion. My dream is to become full stack developer or cloud architect. When I'm finished with work, I enjoy spending time with my friends, playing computer games to relax, cooking or listening to music.
          </Paragraph>
        </Section>
        <Section delay={0.3}>
          <Heading as="h3" variant="section-title">
            I ♥
          </Heading>
          <Paragraph>
            Music, Drawing, Playing Games, Cafe Art, Creating an applications and websites, Cloud architecting.
          </Paragraph>
        </Section>
        <Breaker />
        <Container align='center' id='skills'>
          <Heading as='h3' fontSize={20} mb={4} >
            Skills
          </Heading>
          <SimpleGrid columns={[1, 1, 2]} spacing={10}>
            {skills.map(skill => (<SkillGridItem key={skill.id} id={skill.id} technology={skill.technology} skill={skill.skill} color={skill.color} />))}
          </SimpleGrid>
        </Container>
        <Breaker />
        <Container id='works' mt={20}>
          <Heading as='h3' fontSize={20} mb={4} >
            Works
          </Heading>
          <SimpleGrid columns={[1, 1, 2]} gap={6}>
            <Section>
              <WorkGridItem id='postApp' title='Post Application' thumbnail={thumbPostdrop} >
                It's my the best app at the moment because it's a full-stack application, based on React, Express and MongoDB.
              </WorkGridItem>
            </Section>
            <Section>
              <WorkGridItem id='todo' title='ToDo Application' thumbnail={thumbToDodrop} >
                Another full-stack application is ToDo app based on React, Express and MongoDB. I made 2 another ToDo Apps in different ways. One in react+typescript, and one in clear react.js.
              </WorkGridItem>
            </Section>
            <Section>
              <WorkGridItem id='portfolio' title='First portfolio front-end' thumbnail={thumbPortfoliodrop}  >
                This is my first 'good-looking' front end portfolio based on Next.js. Unfortunelly this projects was very time consuming. 😥
              </WorkGridItem>
            </Section>
            <Section>
              <WorkGridItem id='chatapp' title='Chat App' thumbnail={thumbChatAppdrop} >
                The chat application that I want to do is still in development. It based on React, Express and Socket.io.
              </WorkGridItem>
            </Section>
          </SimpleGrid>
        </Container>
        <Breaker />
        <Container id='contact'>
          <Heading as='h3' variant='section-title'>
            Contact me
          </Heading>
          <Paragraph>
            email: jakub.zurawski97@gmail.com
          </Paragraph>
        </Container>
      </Container>
    </Layout>
  );
}

export default Page;