import { Text, View, Image } from 'react-native';
import { styles } from './styles';
import { Fragment } from 'react/jsx-runtime';

export function Habilidades() {
     return (
      
        <Fragment>
      <Text style={styles.subTitulo}>Habilidades e Competências</Text>
      <View  style={styles.tarefas}>
           <Text style={styles.text}>
              - Inglês Avançado
              <br></br>
              - Habilidades em linguagens de programação e DBA (Java, Javascript, NODE, Yaml, SQL Server)
              <br></br>
              - Bom gerenciamento de tempo para cumprir prazos
          </Text>
      </View>
      </Fragment>
);
}