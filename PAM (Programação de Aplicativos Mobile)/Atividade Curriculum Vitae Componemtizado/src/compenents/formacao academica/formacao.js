import { Text, View, Image } from 'react-native';
import { styles } from './styles';
import { Fragment } from 'react/jsx-runtime';

export function Formacao() {
     return (
      
        <Fragment>
    <Text style={styles.subTitulo}>Formação Acadêmica</Text>
      <View   style={styles.tarefas}>
           <Text style={styles.text}>
                - Ensino fundamental EMEF Joel Fernandes de Souza (2014-2018)
                <br></br> 
                - Ensino fundamental EMEF Elias Shammas (2018-2019)
                <br></br>
                - Ensino fundamental EMEF Paulo Sarasarte Governador (2019-2021)            
                <br></br>
                - Ensino fundamental CEU Inácio Monteiro (2021-2023)
                <br></br>
                - Ensino médio-técnico ETEC de Cidade Tiradentes (Cursando)
            </Text>

      </View>
      </Fragment>
);
}