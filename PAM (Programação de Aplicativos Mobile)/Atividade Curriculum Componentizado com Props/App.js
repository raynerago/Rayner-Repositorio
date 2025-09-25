import { StyleSheet, View } from 'react-native';
import { Titulo } from './src/compenents/titulo/titulo';
import { Resumo } from './src/compenents/resumo/resumo';
import { Habilidades } from './src/compenents/habilidades/habilidades';
import { Formacao } from './src/compenents/formacao academica/formacao';
import { Experiencias } from './src/compenents/experiencia profissional/experiencia';

export default function App() {
  return (
    <View style={styles.container}>
      <Titulo nome="Rayner Yago de Sousa" telefone="11 97501-8826" email="rayner@email.com" />

      <Resumo descricao="Estudante carismático de Desenvolvimento de Sistemas" />

      <Formacao curso="Ensino Médio" instituicao="ETEC" periodo="2022 - 2024" />

      <Experiencias empresa="Óticas Souza" cargo="Atendente" periodo="2021 - 2023" />

      <Habilidades habilidade="Inglês Avançado, Comunicação, Liderança" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
