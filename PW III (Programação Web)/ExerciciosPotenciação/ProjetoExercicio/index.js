import express from 'express'
const app = express()

app.use(
    express.urlencoded({
        extended:true
        })
    );

    app.use(express.json())
    app.get('/', (req, res) => {
      let ex1 = {
        descricao: '2 ^ 3',
        resolucao : {
            linha1: '2 ^ 3 = 2 * 2 * 2',
            linha2: '8'
        } ,
    }
    res.json(ex1)
})
  
    app.get('/ex2', (req, res) => {
        let ex2 = {
            descricao: '2 ^ 3 * 2 ^ 3',
            resolucao : {
                linha1: '2 ^ 3 = 2 * 2 * 2',
                linha2: '8',
                linha3: '2 ^ 3 = 2 * 2 * 2',
                linha4: '8',
                linha5: '8 * 8',
                linha6: '64'
            } ,
          } 
  
          res.json(ex2)
})
        
  
      app.get('/ex3', (req, res) => {
        let ex3 = {
            descricao: '2 ^ 3 (3/3)',
            resolucao : {
            linha1: '2 ^ 3= 2 * 2 * 2 = 8',
            linha2: '8',
            linha3: '3 / 3',
            linha4: '1',
            linha5: '8 * 1',
            linha6: '8',
            } ,
          } 
          res.json(ex3)
  })

  app.get('/exBas1', (req, res) => {
      let exBas1 = {
        descricao: '2 * 3',
        resolucao : {
            linha1: '2 * 3 = 2 + 2 + 2',
            linha2: '6'
        } ,
    }
    res.json(exBas1)
})

app.get('/exBas2', (req, res) => {
    let exBas2 = {
      descricao: '70 - 3',
      resolucao : {
          linha1: '70 - 3 = 67',
          linha2: '67'
      } ,
  }
  res.json(exBas2)
})

app.get('/exBas3', (req, res) => {
    let exBas3 = {
      descricao: '150 / 2',
      resolucao : {
          linha1: '150 / 2 = 75',
          linha2: '75'
      } ,
  }
  res.json(exBas3)
})

app.get('/exBas4', (req, res) => {
    let exBas4 = {
      descricao: '3034 + 3633 ',
      resolucao : {
          linha1: '3034 + 3633 = 6667',
          linha2: '3667'
      } ,
  }
  res.json(exBas4)
})
      
app.get('/exBas5', (req, res) => {
    let exBas5 = {
      descricao: '54 * 2 - 8 ',
      resolucao : {
          linha1: '54 * 2 - 8  = 54 + 54 = 108 - 8 = 100',
          linha2: '100'
      } ,
  }
  res.json(exBas5)
})

app.get('/exBas6', (req, res) => {
    let exBas6 = {
      descricao: '10 * 67',
      resolucao : {
          linha1: '10 * 67 = 67 + 67 + 67 + 67 + 67 + 67 + 67 + 67 + 67 + 67',
          linha2: '670'
      } ,
  }
  res.json(exBas6)
})

app.get('/exBas7', (req, res) => {
  let exBas7 = {
    descricao: '69 - 136',
    resolucao : {
        linha1: '69 - 136 = -67',
        linha2: '67',
    } ,
}
res.json(exBas7)
})

app.get('/exBas8', (req, res) => {
  let exBas8 = {
    descricao: '420 / 420',
    resolucao : {
        linha1: '420 / 420 = 0',
        linha2: '0'
    } ,
}
res.json(exBas8)
})

app.get('/exBas9', (req, res) => {
  let exBas9 = {
    descricao: '67101 + 2469 ',
    resolucao : {
        linha1: '67101 + 2469 = 69.570',
        linha2: '69.570'
    } ,
}
res.json(exBas9)
})
    
app.get('/exBas10', (req, res) => {
  let exBas10 = {
    descricao: '9 * 99 - 999 ',
    resolucao : {
        linha1: '9 * 99 - 999  = 99 + 99 + 99 + 99 + 99 + 99 + 99 + 99 + 99  = 891 - 999 = 108',
        linha2: '-108'
    } ,
}
res.json(exBas10)
})

app.get('/exVest1', (req, res) => {
    let exVest1 = {
      descricao: 'Simplifique a expressão: 2^3 * 2^4',
      resolucao : {
          linha1: '2^3+4 = 2^7',
          linha2: '2^7 = 128',
          linha3: '128'
      } ,
  }
  res.json(exVest1)
  })

  app.get('/exVest2', (req, res) => {
    let exVest2 = {
      descricao: 'Calcule o valor de: (3^2)^3',
      resolucao : {
          linha1: '3^2*3 = 3^6',
          linha2: '3^6',
          linha3: '729'
      } ,
  }
  res.json(exVest2)
  })

  app.get('/exVest3', (req, res) => {
    let exVest3 = {
      descricao: 'Determine o resultado da expressão: 5^3÷5^2',
      resolucao : {
          linha1: '5^3-3 ÷ 5^1',
          linha2: '5^1',
          linha3: '5'
      } ,
  }
  res.json(exVest3)
  })

  app.get('/exVest4', (req, res) => {
    let exVest4 = {
      descricao: 'Resolva: 2^4*3^2',
      resolucao : {
          linha1: '16 * 9',
          linha2: '144',
      } ,
  }
  res.json(exVest4)
  })
  app.get('/exVest5', (req, res) => {
    let exVest5 = {
      descricao: 'Determine o resultado da expressão: 5^3÷5^2',
      resolucao : {
          linha1: '(4^2)^2 ÷ 2^3',
          linha2: '(4^2)^2=4^4=(2^2)^4=2^8',
          linha3: '2^8÷2^3=2^8−3=2^5=32'
      } ,
  }
  res.json(exVest5 )
  })

    app.listen(3000, ()=> {
        console.log("Rodando na porta 3000")
    })