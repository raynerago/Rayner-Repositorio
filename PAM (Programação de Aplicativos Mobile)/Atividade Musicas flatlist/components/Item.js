// Importa React
import React from 'react';

// Importa componentes do React Native
import { View, Text, Image } from 'react-native';

// Importa os estilos criados
import { styles } from '../styles/styles';

// Cria o componente Item
// Ele recebe dados do produto como propriedades (props)
export default function Item({ title, artist, date, image }) {

  return (

    // Card do produto
    <View style={styles.item}>

      {/* Mostra a imagem do produto */}
      <Image source={image} style={styles.image} />

      {/* Container das informações */}
      <View style={styles.infoContainer}>

        {/* Mostra o nome do artista */}
        <Text style={styles.artist}>{artist}</Text>

        {/* Nome do produto */}
        <Text style={styles.title}>{title}</Text>


          {/* Data */}
          <Text style={styles.date}>{date}</Text>

        </View>

      </View>

  );
}