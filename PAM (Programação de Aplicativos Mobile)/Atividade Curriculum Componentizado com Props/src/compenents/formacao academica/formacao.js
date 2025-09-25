import { Text, View } from 'react-native';
import { styles } from './styles';
import { Fragment } from 'react/jsx-runtime';

export function Formacao({ curso, instituicao, periodo }) {
  return (
    <Fragment>
      <Text style={styles.subTitulo}>Formação Acadêmica</Text>
      <View style={styles.tarefas}>
        <Text style={styles.text}>Curso: {curso}</Text>
        <Text style={styles.text}>Instituição: {instituicao}</Text>
        <Text style={styles.text}>Período: {periodo}</Text>
      </View>
    </Fragment>
  );
}
