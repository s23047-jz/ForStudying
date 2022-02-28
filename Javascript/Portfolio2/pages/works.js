import { Container, Heading, SimpleGrid } from '@chakra-ui/react';

import Section from '../components/section';
import { WorkGridItem } from '../components/grid-item';
import Layout from '../components/layouts/article';

import thumbToDodrop from '../public/images/works/1.jpg';
import thumbPostdrop from '../public/images/works/2.jpg';
import thumbPortfoliodrop from '../public/images/works/3.jpg';
import thumbChatAppdrop from '../public/images/works/4.jpg';

const Works = () => {
  return (
    <Layout title="Works">
      <Container>
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
              This is my first 'good-looking' front end portfolio based on Next.js. I spent a week to made it. 😥
            </WorkGridItem>
          </Section>
          <Section>
            <WorkGridItem id='chatapp' title='Chat App' thumbnail={thumbChatAppdrop} >
              The chat application that I want to do is still in development. It based on React, Express and Socket.io.
            </WorkGridItem>
          </Section>
        </SimpleGrid>
      </Container>
    </Layout>
  );
}

export default Works;