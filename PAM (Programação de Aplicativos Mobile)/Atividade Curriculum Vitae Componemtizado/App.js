import { StyleSheet, Text, View } from 'react-native';
import { Titulo } from './src/compenents/titulo/titulo';
import { Resumo } from './src/compenents/resumo/resumo.js';
import { Habilidades } from './src/compenents/habilidades/habilidades.js';
import { Formacao } from './src/compenents/formacao academica/formacao.js';
import { Experiencias } from './src/compenents/experiencia profissional/experiencia.js';


export default function App() {
  return (
    <View style={estilos.container}>

      <Titulo></Titulo>

      <Resumo></Resumo>
      
      <Habilidades></Habilidades>
    
      <Formacao></Formacao>

      <Experiencias></Experiencias>
      
    </View>
  );
}

const estilos = StyleSheet.create({

  container: {
    display: 'flex',
    backgroundColor: '#ffffffff',
    alignItems: 'center',
    justifyContent: 'center',
    width: '100%',
    height: '120%',
   
  },  
});
