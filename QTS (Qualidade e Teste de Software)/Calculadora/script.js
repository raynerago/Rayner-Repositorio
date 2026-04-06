function numero(valor) {
    document.getElementById("display").value += valor;
        if (bloqueado) return;
        document.getElementById("display").value += valor;
      
  }

  function dividir(valor) {
    document.getElementById("display").value += valor;
  }

  function multiplicar(valor) {
    document.getElementById("display").value += valor;
  }
  
  function limpar() {
    document.getElementById("display").value = "";
    bloqueado = false;      
  }
  
  function apagar() {
    let atual = document.getElementById("display").value;
    document.getElementById("display").value = atual.slice(0, -1);
  }
  
  function calcular() {
    try {
      let display = document.getElementById("display");
      let expressao = display.value;
  
      if (expressao.includes("/0")) {
        display.value = "Indeterminado";
        bloqueado = true;
        return;
      }
  
      let resultado = eval(expressao);
  
      if (!isFinite(resultado)) {
        display.value = "Indeterminado";
        bloqueado = true;
      } else {
        display.value = resultado;
      }
  
    } catch {
      document.getElementById("display").value = "Erro";
      bloqueado = true;
    }
  }

  document.addEventListener('keydown', (event) => {
    const display = document.getElementById("display");
    if (bloqueado && event.key !== 'Escape') return;
   
    if (!isNaN(event.key)) {
      display.value += event.key;
    }
  
    
    if (['+', '-', '*', '/'].includes(event.key)) {
      display.value += event.key;
    }
  

    if (event.key === 'Enter') {
      calcular();
    }
  

    if (event.key === 'Backspace') {
      apagar();
    }
  
    if (event.key === 'Escape') {
      limpar();
    }

 
  });
const display = document.getElementById('display');

let bloqueado = false;


