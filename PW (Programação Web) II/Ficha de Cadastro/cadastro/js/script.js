
let btn = document.querySelector('.div_button')

btn.addEventListener('click', pegarDados)



function pegarDados(){
    let form = document.querySelector('form')

    let pessoa = {
        nome: form.nome.value,
        email: form.email.value,
        cpf: form.cpf.value,
        nascimento: form.nascimento.value,
        altura: form.altura.value,
        peso: form.peso.value,
        academia: form.academia.value,
        pagamento: form.pagamento.value,
        plano: form.plano.value,
        sexo: form.sexo.value,
    }
    
    sessionStorage.pessoa = JSON.stringify(pessoa)
    location.href = 'http://127.0.0.1:5500/confirmarCadastro.html'
}