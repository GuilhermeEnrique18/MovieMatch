# 🎬MovieMatch Classificação e Recomendação de Filmes e Series

Este módulo faz parte de um sistema em Java voltado para gerenciamento e recomendação de mídias (como filmes e séries). Ele é responsável por calcular tempo total de consumo, aplicar filtros de recomendação e manipular classificações.

---

## 📁 Estrutura do Módulo

| Classe                   | Responsabilidade                                                                 |
|--------------------------|-----------------------------------------------------------------------------------|
| `Interface - Classification.java`    | Interface funcional que define o contrato para objetos que podem ser classificados (avaliados). |
| `FilterRecomendations.java` | Aplica regras de recomendação baseadas em critérios como nota e número de avaliações. |
| `TimeCalculator.java`    | Acumula e calcula o tempo total de exibição ou duração de múltiplos títulos.     |
| `Ep.java` | Aplica regras de definição de episodios semelhante a filmes e series. |
| `Movie.java`    | Define como é a declaração de filmes.     |
| `Series.java` | Aplica regras de definição de episodios semelhante às dos filmes. |
| `Title.java`    | SuperClasse que define os principais metodos e atributos como `name` e `showTechnicalSheet`.     |


---

## ✅ Funcionalidades

- Interface `Classification` para padronizar objetos com nota ou avaliação
- Filtro de recomendação baseado em regras de popularidade e avaliação
- Cálculo de tempo total de reprodução (maratonas, playlists etc.)

---

## 🔍 Tecnologias utilizadas

- Java 17+
- Interface funcional
- Programação Orientada a Objetos (POO)
- Console/Terminal

---

## 🚀 Como usar

1. Certifique-se de que as classes estão integradas ao projeto principal (com classes como `Title`, `Movie`, `Series`, etc.).
2. Defina os objetos e execute a classe main.
---
🧑‍💻 Desenvolvido por mim! Fique a vontade para fazer algumas alterações.

