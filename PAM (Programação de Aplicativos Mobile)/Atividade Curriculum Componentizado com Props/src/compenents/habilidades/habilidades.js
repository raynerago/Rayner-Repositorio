import { Text, View } from 'react-native';
import { styles } from './styles';
import { Fragment } from 'react/jsx-runtime';

export function Habilidades({ habilidade }) {
  return (
    <Fragment>
      <Text style={styles.subTitulo}>Habilidades e Competências</Text>
      <View style={styles.tarefas}>
        <Text style={styles.text}>{habilidade}</Text>
      </View>
    </Fragment>
  );
}
