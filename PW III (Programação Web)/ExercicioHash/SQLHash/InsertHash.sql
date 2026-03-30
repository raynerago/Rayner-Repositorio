USE dbHash;
BEGIN;

INSERT INTO tbDevs (nome, funcao, frase) VALUES
('Gabriel Santos', 'Engenheiro de Software Backend', 'Café é o combustível, mas o código limpo é a alma do projeto.'),
('Isabela Martins', 'Desenvolvedora de Interface (UI/UX)', 'Se o design não for responsivo, a experiência do usuário está quebrada.'),
('Pedro Almeida', 'Cientista de Dados', 'Dados são o novo petróleo, mas sem refinamento são apenas ruído.'),
('Camila Nogueira', 'Desenvolvedora Fullstack', 'A melhor parte do dia é quando o bug que levou 3 horas é resolvido com uma linha.'),
('Henrique Carvalho', 'Engenheiro DevOps', 'Automatizar não é luxo, é sobrevivência em escala.');

INSERT INTO tbTarefas (nome_da_tarefa, tempo, relevancia, stats) VALUES
('Aprender a tocar violão', 60, 'importante', 'em progresso'),
('Plantar flores no jardim', 45, 'pouco importante', 'finalizada'),
('Fazer caminhada ao ar livre', 30, 'muito importante', 'atrasada'),
('Assistir a um documentário', 90, 'importante', 'em progresso'),
('Escrever no diário', 20, 'muito importante', 'finalizada'),
('Aprender receitas novas', 120, 'importante', 'atrasada'),
('Organizar fotos antigas', 60, 'pouco importante', 'em progresso'),
('Fazer yoga', 45, 'muito importante', 'finalizada'),
('Desenhar ou pintar', 90, 'importante', 'em progresso'),
('Ouvir podcasts educativos', 30, 'pouco importante', 'finalizada'),
('Meditar ao amanhecer', 15, 'importante', 'atrasada'),
('Fazer um quebra-cabeça', 40, 'pouco importante', 'finalizada'),
('Escrever uma carta para um amigo', 20, 'muito importante', 'em progresso'),
('Aprender frases em outro idioma', 30, 'importante', 'atrasada'),
('Fazer uma sessão de alongamento', 10, 'pouco importante', 'finalizada'),
('Explorar um bairro da cidade', 60, 'importante', 'em progresso'),
('Ler uma revista ou artigo online', 25, 'muito importante', 'atrasada'),
('Fazer exercícios de respiração', 15, 'pouco importante', 'em progresso'),
('Planejar um passeio no fim de semana', 45, 'importante', 'atrasada'),
('Assistir a um filme em família', 120, 'muito importante', 'finalizada');

INSERT INTO tbUsuarios (nome, usuario, senha) VALUES
('Gabriel Martins', 'gabriel.martins', 'Gabr13l@2026'),
('Beatriz Almeida', 'beatriz.almeida', 'BeaL!mda88'),
('Lucas Pereira', 'lucas.pereira', 'Lup3r!23'),
('Camila Rocha', 'camila.rocha', 'CamiR0ch@2026'),
('Fernando Costa', 'fernando.costa', 'F3rn@nd0C0st@');

SELECT * FROM tbUsuarios;
SELECT * FROM tbDevs;
SELECT * FROM tbTarefas;