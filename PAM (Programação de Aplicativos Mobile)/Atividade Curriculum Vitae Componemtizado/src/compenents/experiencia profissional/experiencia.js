import { Text, View, Image } from 'react-native';
import { styles } from './styles';
import { Fragment } from 'react/jsx-runtime';

export function Experiencias() {
     return (
      
        <Fragment>
      <Text style={styles.subTitulo}>Experiências Profissionais</Text>
      <View   style={styles.tarefas}>
           <Text style={styles.text}>
                Marketing de redes socias
                <br></br>                
                Óticas Souza - São Paulo, SP 
               </Text>
      </View>
      </Fragment>
);
}