import styled from '@emotion/styled/';

export const Breaker = styled.div`
  width: 100%;
  height: 6px;
  margin: 50px 0;
  border-radius: 10px;
  background-color: #fff;
  background: ${(props) => props.colorAlt ?
    'linear-gradient(270deg, #F46737 0%, #945DD6 100%)' :
    'linear-gradient(270deg, #13ADC7 0%, #945DD6 100%)'};
    margin: ${(props) => props.divider ? "4rem 0" : ""};
  @media ${(props) => props.theme.breakpoints.md} {
    width: 48px;
    height: 4px;
  }
  @media ${(props) => props.theme.breakpoints.sm} {
    width: 32px;
    height: 2px;
  }
`