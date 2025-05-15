
const pessoa = JSON.parse(sessionStorage.pessoa)

let spans = document.querySelectorAll('span')

spans[0].textContent = pessoa.nome
spans[1].textContent = pessoa.email
spans[2].textContent = pessoa.cpf
spans[3].textContent = pessoa.nascimento
spans[4].textContent = pessoa.altura
spans[5].textContent = pessoa.peso
spans[6].textContent = pessoa.academia
spans[7].textContent = pessoa.pagamento
spans[8].textContent = pessoa.plano
spans[9].textContent = pessoa.sexo

const img = document.querySelector('.impressora')

img.addEventListener('click', ()=>{
    img.style.display = 'none'
    window.print()
    img.style.display = 'block'
})
