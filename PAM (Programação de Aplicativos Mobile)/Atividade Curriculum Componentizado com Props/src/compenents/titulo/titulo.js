import { Text, View } from 'react-native';
import { styles } from './styles';
import { Fragment } from 'react/jsx-runtime';

export function Titulo({ nome, telefone, email }) {
  return (
    <Fragment>
      <Text style={styles.titulo}>Currículo</Text>
      <Text style={styles.titulo}>{nome}</Text>
      <View style={styles.informacoes}>
        <Text style={styles.legenda}>Telefone: {telefone}</Text>
        <Text style={styles.legenda}>E-mail: {email}</Text>
      </View>
    </Fragment>
  );
}
