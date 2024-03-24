# Projeto ChickenHouse

Este é um projeto de e-commerce desenvolvido em Java com o framework Spring, dividido em microsserviços para melhor modularização e escalabilidade.

## Descrição

O projeto consiste em uma aplicação de comércio eletrônico, onde os clientes podem visualizar, comprar e acompanhar o status de seus pedidos. A arquitetura é baseada em microsserviços, facilitando a adição de novas funcionalidades e a escalabilidade do sistema.

## Microsserviços

- **eureka**: Serviço de descoberta e registro de outros serviços, utilizando o Eureka Server.
- **gateway**: Microsserviço de gateway, responsável por rotear as requisições para os microsserviços apropriados.
- **msauth**: Microsserviço de autenticação, gerenciamento de usuários e controle de acesso.

## Roadmap de Desenvolvimento Futuro

- **msproduct**: Microsserviço de produtos, responsável pelo gerenciamento de produtos.
- **mscart**: Microsserviço de carrinho de compras.
- **msorder**: Microsserviço de pedidos.
- **mspayment**: Microsserviço de pagamentos.
- **msdelivery**: Microsserviço de entrega.
- **msemail**: Microsserviço de envio de e-mails relacionados aos pedidos.

## Contribuindo

Sinta-se à vontade para contribuir com o desenvolvimento do projeto! Você pode abrir issues para reportar bugs, sugerir novas funcionalidades ou enviar pull requests com melhorias.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
