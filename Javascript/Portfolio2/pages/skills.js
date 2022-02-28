import { Container, SimpleGrid, Heading } from '@chakra-ui/react';

import Layout from '../components/layouts/article';
import { SkillGridItem } from '../components/skill-grid';

import { skills } from "../constants/skills";

const Skills = () => {
  return (
    <Layout title='Skills'>
      <Container align='center' mt={20}>
        <Heading as='h3' fontSize={20} mb={4} >
          Skills
        </Heading>
        <SimpleGrid columns={[1, 1, 2]} spacing={10}>
          {skills.map(skill => (<SkillGridItem key={skill.id} id={skill.id} technology={skill.technology} skill={skill.skill} color={skill.color} />))}
        </SimpleGrid>
      </Container>
    </Layout >
  );
}

export default Skills;