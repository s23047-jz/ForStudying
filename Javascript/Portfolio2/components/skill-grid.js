import { Box, CircularProgress, CircularProgressLabel } from '@chakra-ui/react';

export const SkillGridItem = ({ id, technology, skill, color }) => {
  return (
    <Box w='100%' align='center'>
      <CircularProgress id={id} value={skill} color={color} size='140px'>
        <CircularProgressLabel>{technology}</CircularProgressLabel>
      </CircularProgress>
    </Box>
  );
} 