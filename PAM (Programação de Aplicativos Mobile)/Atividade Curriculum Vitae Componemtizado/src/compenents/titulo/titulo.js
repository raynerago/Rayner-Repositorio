import { Text, View, Image } from 'react-native';
import { styles } from './styles';
import { Fragment } from 'react/jsx-runtime';

export function Titulo() {
  return (
      <><Text style={styles.titulo}>Currículo</Text>
      <Text style={styles.titulo}>Rayner Yago de Sousa</Text>
      <View style={styles.informacoes}>
      <Text style={styles.legenda}>TELEFONE: 11 97501-8826
        <br></br>
        EMAIL: raynersousa640@gmail.com
        <br></br>
        LOGRADOURO: Rua Barão Barroso do Amazonas 52
        <br></br>
        CEP: 08472-721

      </Text>
    </View></>
     
  );
}
