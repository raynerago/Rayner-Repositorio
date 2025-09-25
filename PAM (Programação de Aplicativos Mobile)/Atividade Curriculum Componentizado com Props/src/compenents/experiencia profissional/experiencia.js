import { Text, View } from 'react-native';
import { styles } from './styles';
import { Fragment } from 'react/jsx-runtime';

export function Experiencias({ empresa, cargo, periodo }) {
  return (
    <Fragment>
      <Text style={styles.subTitulo}>Experiência Profissional</Text>
      <View style={styles.tarefas}>
        <Text style={styles.text}>Empresa: {empresa}</Text>
        <Text style={styles.text}>Cargo: {cargo}</Text>
        <Text style={styles.text}>Período: {periodo}</Text>
      </View>
    </Fragment>
  );
}
