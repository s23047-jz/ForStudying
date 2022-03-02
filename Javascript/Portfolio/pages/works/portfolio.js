import { Container, Heading, Link } from '@chakra-ui/react';

import Layout from '../../components/layouts/article';
import Paragraph from '../../components/paragraph';


const Work = () => (
  <Layout title="portfolio">
    <Container>
      <Heading as='h2' variant='second-title' mt={20}>
        First font end project
      </Heading>
      <Paragraph>
        This is my first front end my which is based on Next.js. This one is just modify the version of that. Not much changes but I added something new even like that link page.
      </Paragraph>
      <Link href='https://portfolio-nine-nu-31.vercel.app/' mt={20}>Here is a first portoflio page</Link>
    </Container>
  </Layout>

)

export default Work;