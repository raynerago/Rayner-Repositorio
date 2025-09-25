import { StyleSheet } from 'react-native';

export let styles = StyleSheet.create({
  subTitulo: {
    fontFamily: 'Helvetica',
    fontSize: '20px',
    marginTop: '50px',
  },
    tarefas:{
    display: 'flex',
    justifyContent: 'space-around',
    alignItems: 'center',
    width: '20%', 
    marginTop: '10px',
    border: 'solid black 1px',

  }, 
    text:{
     width: '75%',
     fontSize: '15px',
     textAlign: 'justify'
  }
});