import Logo from './logo'
import NextLink from 'next/link'
import {
  Container, Box, Link, Stack, Heading, Flex, Menu, MenuItem, MenuList, MenuButton, IconButton, useColorModeValue
} from '@chakra-ui/react'
import { HamburgerIcon } from '@chakra-ui/icons'
import ThemeToggleButton from './theme-toggle-button'
import { IoLogoGithub } from 'react-icons/io5'

const LinkItem = ({ href, path, _target, children, ...props }) => {
  const active = path === href
  const inactiveColor = useColorModeValue('gray200', 'whiteAlpha.900')
  return (
    <NextLink href={href} passHref>
      <Link p={2} bg={active ? 'grassTeal' : undefined} color={active ? '#202023' : inactiveColor} _target={_target} {...props} >
        {children}
      </Link>
    </NextLink>
  )
}

const Navbar = props => {
  const { path } = props

  return (
    <Box position="fixed" as="nav" w="100%" bg={useColorModeValue('#ffffff40', '#19192980')} css={{ backdropFilter: 'blur(10px)' }} zIndex={1} {...props} >
      <Container display="flex" p={2} maxW="container.md" wrap="wrap" align="center" justify="space-between">
        <Flex align="center" mr={5}>
          <Heading as="h1" size="lg" letterSpacing={'tighter'}>
            <Logo />
          </Heading>
        </Flex>

        <Stack direction={{ base: 'column', md: 'row' }} display={{ base: 'none', md: 'flex' }} width={{ base: 'full', md: 'auto' }} alignItems="center" flexGrow={1} mt={{ base: 4, md: 0 }} >
          <LinkItem href="#works" path={path}>
            Works
          </LinkItem>
          <LinkItem href="#skills" path={path}>
            Skills
          </LinkItem>
          <LinkItem href="#contact" path={path}>
            Contact
          </LinkItem>
          <LinkItem _target="_blank" href="https://github.com/s23047-jz/ForStudying" path={path} display="inline-flex" alignItems="center" style={{ gap: 4 }} pl={2} >
            <IoLogoGithub />
            Github
          </LinkItem>
        </Stack>

        <Box flex={1} align="right">
          <ThemeToggleButton />
          <Box ml={2} display={{ base: 'inline-block', md: 'none' }}>
            <Menu isLazy id="navbar-menu">
              {/* isLazy odracza nam renderowanie elementow MenuList dopoki Menu nie zostanie otwarte*/}
              {/* Domyślnie składnik Menu renderuje wszystkie elementy podrzędne MenuList do modelu DOM, co oznacza, że niewidoczne elementy menu są nadal renderowane, ale są ukryte przez style. */}
              <MenuButton as={IconButton} icon={<HamburgerIcon />} variant="outline" aria-label="Options" />
              <MenuList>
                <NextLink href="/" passHref>
                  <MenuItem as={Link}>Home</MenuItem>
                </NextLink>
                <NextLink href="#works" passHref>
                  <MenuItem as={Link}>Works</MenuItem>
                </NextLink>
                <NextLink href="#skills" passHref>
                  <MenuItem as={Link}>Skills</MenuItem>
                </NextLink>
                <NextLink href="#contact" passHref>
                  <MenuItem as={Link}>Contact</MenuItem>
                </NextLink>
                <MenuItem as={Link} href="https://github.com/s23047-jz/ForStudying">
                  View Github
                </MenuItem>
              </MenuList>
            </Menu>
          </Box>
        </Box>
      </Container>
    </Box>
  )
}

export default Navbar