import { Container, Heading, Link } from '@chakra-ui/react';

import Layout from '../../components/layouts/article';
import Paragraph from '../../components/paragraph';


const Work = () => (
  <Layout title="postApp">
    <Container>
      <Heading as='h2' variant='second-title' mt={20}>
        Under development
      </Heading>
      <Paragraph>
        I did not create this app yet.
      </Paragraph>
    </Container>
  </Layout>

)

export default Work;