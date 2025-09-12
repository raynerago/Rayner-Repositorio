import { Text, View, Image } from 'react-native';
import { styles } from './styles';
import { Fragment } from 'react/jsx-runtime';

export function Resumo() {
     return (
      
        <Fragment>
<Text style={styles.subTitulo}>Resumo</Text>
     
      <View style={styles.tarefas}>
           <Text style={styles.text}>
            Estudante carismático de Desenvolvimento de Sistemas
            na ETEC de Cidade Tiradentes. Busco a oportunidade de
            aplicar toda teoria que venho aprendendo no curso.
          </Text>
      </View>
      </Fragment>
);
}