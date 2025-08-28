import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Image, ImageBackground } from 'react-native';


export default function App() {
  return (
    <View style={styles.container}>
     
      <Text style={styles.titulo}>Currículo</Text>
      <Text style={styles.titulo}>Rayner Yago de Sousa</Text>
      
      <View style={styles.informacoes}>
        <Text style={styles.legenda}>TELEFONE: 11 97501-8826
                                    <br></br>
                                     EMAIL: raynersousa640@gmail.com
                                    <br></br>
                                    LOGRADOURO: Rua Barão Barroso do Amazonas 52 
                                    <br></br>
                                    CEP: 08472-721

      </Text>
      </View>
      <Text style={styles.subTitulo}>Resumo</Text>
     
      <View style={styles.tarefas}>
           <Text style={styles.text}>
            Estudante carismático de Desenvolvimento de Sistemas
            na ETEC de Cidade Tiradentes. Busco a oportunidade de
            aplicar toda teoria que venho aprendendo no curso.
          </Text>
      </View>

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

      <Text style={styles.subTitulo}>Experiências Profissionais</Text>
      <View   style={styles.tarefas}>
           <Text style={styles.text}>
                Marketing de redes socias
                <br></br>                
                Óticas Souza - São Paulo, SP 
               </Text>
      
      </View>
       
    
    </View>
  );
}

const styles = StyleSheet.create({

  subTitulo: {
    fontFamily: 'Helvetica',
    fontSize: '20px',
    marginTop: '50px',
  },

  titulo: {
    fontFamily: 'Helvetica',
    fontSize: '35px'

  },
  container: {
    display: 'flex',
    backgroundColor: '#ffffffff',
    alignItems: 'center',
    justifyContent: 'center',
    width: '100%',
    height: '120%',
   
  },  
  fundo:{
    height: '100%',
    width: '100%', 
    display: 'flex',
    justifyContent: 'center',
    position: 'absolute'
  },
  tinyLogo: {
    width: 50,
    height: 50,
    borderRadius: '25%',
    shadowColor:  '60px -16px teal;'
  },
  tarefas:{
    display: 'flex',
    justifyContent: 'space-around',
    alignItems: 'center',
    width: '20%', 
    marginTop: '10px',
    border: 'solid black 1px',

  }, 
  informacoes:{
    marginTop: '10px',
    justifyContent: 'center',
    display: 'flex'
  },

  text:{
     width: '75%',
     fontSize: '15px',
     textAlign: 'justify'
  }
});
