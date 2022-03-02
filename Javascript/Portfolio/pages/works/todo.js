import { Container, Heading, Link } from '@chakra-ui/react';

import Layout from '../../components/layouts/article';
import Paragraph from '../../components/paragraph';


const Work = () => (
  <Layout title="postApp">
    <Container>
      <Heading as='h2' variant='second-title' mt={20}>
        No host
      </Heading>
      <Paragraph>
        I do not host that works yet.
      </Paragraph>
      <Link href='https://github.com/s23047-jz/ForStudying' mt={20}>You can find this project here</Link>
    </Container>
  </Layout>

)

export default Work;