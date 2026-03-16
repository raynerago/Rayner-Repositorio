import express from 'express'
const app = express()

app.use(
    express.urlencoded({
        extended:true
        })
    );

    app.use(express.json())

    const listaBasica = [
      {questao: 1,
        descricao: '2 ^ 3',
        resolucao : {
            linha1: '2 ^ 3 = 2 * 2 * 2',
            linha2: '8'
        }
      },

        { questao: 2,
          descricao: '2 ^ 3 * 2 ^ 3',
          resolucao : {
              linha1: '2 ^ 3 = 2 * 2 * 2',
              linha2: '8',
              linha3: '2 ^ 3 = 2 * 2 * 2',
              linha4: '8',
              linha5: '8 * 8',
              linha6: '64'
          } ,
          
        },

        {questao: 3,
          descricao: '2 ^ 3 (3/3)',
            resolucao : {
            linha1: '2 ^ 3= 2 * 2 * 2 = 8',
            linha2: '8',
            linha3: '3 / 3',
            linha4: '1',
            linha5: '8 * 1',
            linha6: '8',
            } ,
        },

        {questao: 4,
         descricao: '2 * 3',
         resolucao : {
            linha1: '2 * 3 = 2 + 2 + 2',
            linha2: '6'
        } ,
        },

        {questao: 5,
          descricao: '70 - 3',
          resolucao : {
              linha1: '70 - 3 = 67',
              linha2: '67'
        }
      },

        {questao: 6,
          descricao: '150 / 2',
          resolucao : {
              linha1: '150 / 2 = 75',
              linha2: '75'
        }
      },

      {questao: 7,
        descricao: '3034 + 3633 ',
        resolucao : {
            linha1: '3034 + 3633 = 6667',
            linha2: '3667'
        }
      },

      {questao: 8,
        descricao: '54 * 2 - 8 ',
      resolucao : {
          linha1: '54 * 2 - 8  = 54 + 54 = 108 - 8 = 100',
          linha2: '100'
        } ,
      },

      {questao: 9,
        descricao: '10 * 67',
      resolucao : {
          linha1: '10 * 67 = 67 + 67 + 67 + 67 + 67 + 67 + 67 + 67 + 67 + 67',
          linha2: '670'
        } ,
      },

      {questao: 10,
        descricao: '69 - 136',
        resolucao : {
            linha1: '69 - 136 = -67',
            linha2: '67',
        } ,
      }
      
    ]
        
    const listaVestibular = [
      {questao: 1,
        descricao: 'Simplifique a expressão: 2^3 * 2^4',
        resolucao : {
            linha1: '2^3+4 = 2^7',
            linha2: '2^7 = 128',
            linha3: '128'
        },
      },

      {questao: 2,
        descricao: 'Calcule o valor de: (3^2)^3',
        resolucao : {
            linha1: '3^2*3 = 3^6',
            linha2: '3^6',
            linha3: '729'
        } ,
      },

      {questao: 3,
        descricao: 'Determine o resultado da expressão: 5^3÷5^2',
        resolucao : {
            linha1: '5^3-3 ÷ 5^1',
            linha2: '5^1',
            linha3: '5'
        } ,
      },

      {questao: 4,
        descricao: 'Resolva: 2^4*3^2',
        resolucao : {
            linha1: '16 * 9',
            linha2: '144',
        } ,
      },

      {questao: 5,
        descricao: 'Determine o resultado da expressão: 5^3÷5^2',
        resolucao : {
            linha1: '(4^2)^2 ÷ 2^3',
            linha2: '(4^2)^2=4^4=(2^2)^4=2^8',
            linha3: '2^8÷2^3=2^8−3=2^5=32'
        } ,
      }
    ]

    function buscarPorQuestaoBasica (questao) {
      return listaBasica.filter(exercicio => exercicio.questao == questao)
  }

  function buscarPorQuestaoVestibular (questao) {
    return listaVestibular.filter(exercicio => exercicio.questao.toString().includes(questao))
}

//Query
app.get('/exerc/query/basica', (req, res) => {
  const { questao } = req.query;
  res.send(buscarPorQuestaoBasica(questao));
})

app.get('/exerc/query/vestibular', (req, res) => {
  const { questao } = req.query;
  res.send(buscarPorQuestaoVestibular(questao));
})

//Body
app.post('/exerc/body/basica', (req, res) => {
  const { questao } = req.body;
  res.send(buscarPorQuestaoBasica(questao));
})

app.post('/exerc/body/vestibular', (req, res) => {
  const { questao } = req.body;
  res.send(buscarPorQuestaoVestibular(questao));
})

    app.listen(3000, ()=> {
        console.log("Rodando na porta 3000")
    })