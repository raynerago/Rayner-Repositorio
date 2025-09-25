import { Text, View } from 'react-native';
import { styles } from './styles';
import { Fragment } from 'react/jsx-runtime';

export function Resumo({ descricao }) {
  return (
    <Fragment>
      <Text style={styles.subTitulo}>Resumo</Text>
      <View style={styles.tarefas}>
        <Text style={styles.text}>{descricao}</Text>
      </View>
    </Fragment>
  );
}
