# tdd-salario

Uma empresa	 precisa calcular	 o	 salário do funcionário	 e	 seus	 descontos.	 
Para calcular	 esse	 desconto,	 a empresa	 leva	 em	 consideração	 o	 salário	 atual	 e	 o	 cargo	 do funcionário.

Funcionário tem Nome, Sobrenome, salario bruto, Cargo e salario liquido.

As	regras	de	negócio	são	as seguintes:


- Desenvolvedores possuem 20% de desconto caso seus salários sejam maiores do que R$3.000,00. Caso contrário, o desconto é de 10%.
- DBAs e QAs possuem desconto de 25% se seus salários forem maiores do que R$2.500,00. Em caso contrário, 15%.
- Coordenadores e Gerentes possuem desconto de 30% se seus salários forem maiores do que R$4.500,00. Em caso contrário, 25%.
- Caso cargo não exista, retornar uma exceção com a mensagem "Cargo invalido";
- Caso funcionário não tenha sobrenome, retornar uma exceção com a mensagem "Funcionário invalido";

Cenarios:
- Validar salario liquido para desenvolvedores com salario abaixo do limite (R$3.000,00)
- Validar salario liquido para desenvolvedores com salario acima do limite (R$3.000,00)
- Validar salario liquido para dbas com salario abaixo do limite (R$2.500,00)
- Validar salario liquido para dbas com salario acima do limite (R$2.500,00)
- Validar salario liquido para qas com salario abaixo do limite (R$4.500,00)
- Validar salario liquido para qas com salario acima do limite (R$4.500,00)
- Validar que o campo cargo não pode ser nulo



Fase 2

Armazenar funcionario calculando o salario liquido em um H2.

Cenários:
Validar inserção do funcionário no banco de dados, com o salario liquido calculado corretamente.
Validar que o campo cargo não pode ser nulo


Fase 3

Expor um endpoint de post para gravar um funcionario
Expor um endpoint de get para retornar todos os funcionarios

Cenários:
Validar status code de sucesso pra o endpoint de post, e se o funcionário inserido está correto
Validar status code de sucesso pra o endpoint de get, e se o size esperado é igual a qtd de funcionarios inseridos
validar status code de bad request para o endpoint de post, se o cargo for nulo


