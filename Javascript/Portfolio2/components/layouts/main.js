import Head from "next/head";
import { Box, Container } from '@chakra-ui/react';

import Navbar from '../navbar'
import VoxelDog from "../voxel-dog";
import { NoSsr } from "@material-ui/core";

const Main = ({ children, router }) => {
  return (
    <Box as="main" pb={8}>
      <Head>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="cat.png" href="cat.png" />
        <link rel="shortcut icon" href="/cat.png" type="image/x-icon" />
        <title>Jacob Portfolio</title>
      </Head>
      <Navbar path={router.asPath} />
      {/* pt= paddingTop, maxW maxWidth */}
      <Container maxW='container.md' pt={14}>
        <NoSsr>
          <VoxelDog />
        </NoSsr>
        {children}
      </Container>
    </Box>
  );
}

export default Main;
