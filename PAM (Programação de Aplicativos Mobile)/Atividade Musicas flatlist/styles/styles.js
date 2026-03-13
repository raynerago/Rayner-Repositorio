// Importa o StyleSheet do React Native
// Ele serve para criar estilos otimizados (melhor performance)
import { StyleSheet } from "react-native";

// Exporta o objeto styles para poder usar em outros arquivos
export const styles = StyleSheet.create({

  // Container principal da tela
  container: {

    // flex:1 faz o container ocupar toda a tela
    flex: 1,

    // Cor de fundo da tela (preto)
    backgroundColor: "#000000",

    // Espaço no topo da tela
    paddingTop: 20,
  },

  artist: {

    // Tamanho pequeno
    fontSize: 12,

    // Peso da fonte (semi-negrito)
    fontWeight: "600",

    // Cor cinza
    color: "#8A8A8A",

    // Espaçamento entre letras (visual mais premium)
    letterSpacing: 1,

    // Deixa tudo em maiúsculo
    textTransform: "uppercase",

    // Espaço abaixo da marca
    marginBottom: 4,
  },

  // Card do produto
  item: {

    // Fundo cinza do card
    backgroundColor: "#7B0000",

    // Espaçamento horizontal (esquerda/direita)
    marginHorizontal: 18,

    // Espaçamento vertical entre os cards
    marginVertical: 12,

    // Bordas arredondadas modernas
    borderRadius: 16,

    // Impede conteúdo de ultrapassar as bordas
    overflow: "hidden",

    // Cor da sombra
    shadowColor: "#000",

    // Posição da sombra
    shadowOffset: {
      width: 0,
      height: 6
    },

    // Transparência da sombra
    shadowOpacity: 0.08,

    // Suavidade da sombra
    shadowRadius: 10,

    // Sombra para Android
    elevation: 6,
  },


  // Estilo da imagem do produto
  image: {

    // Largura ocupa todo o card
    width: "100%",

    // Altura fixa da imagem
    height: 190,

    // Faz a imagem preencher o espaço sem deformar
    resizeMode: "cover",
  },


  // Container das informações (texto)
  infoContainer: {

    // Espaçamento interno
    padding: 16,
  },


  // Nome da musica
  title: {

    // Fonte maior
    fontSize: 18,

    // Cor branca
    color: "white",

    // Espaço abaixo
    marginBottom: 8,
  },

  // Estilo do ano de lançamento
  date: {

    // Tamanho médio
    fontSize: 18,


    // Cor branca
    color: "#ffffff",
  },

});