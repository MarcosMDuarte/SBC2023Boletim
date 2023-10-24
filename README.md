# SBC2023Boletim
Projeto de API RESTful para boletim anual com o objetivo de entrega do projeto final do Santander Bootcamp JAVA 2023

``` mermaid
classDiagram
  class Alunos {
    - name: string
    - boletim: Boletim
    - carteirinha: Carteirinha
    - avisos: Aviso[]
  }

  class Boletim {
    - anoLetivo: string
    - notaMatematica: float
    - notaPortugues: float
    - notaCiencias: float
    - notaHistoria: float
    - notaGeografia: float
    - frequenciaMatematica: float
    - frequenciaPortugues: float
    - frequenciaCiencias: float
    - frequenciaHistoria: float
    - frequenciaGeografia: float
  }

  class Carteirinha {
    - number: string
    - validade: string
  }

  class Aviso {
    - icon: string
    - description: string
  }

  Alunos "1" --> "1" Boletim
  Alunos "1" --> "1" Carteirinha
  Alunos "1" --> "0..*" Aviso
```
