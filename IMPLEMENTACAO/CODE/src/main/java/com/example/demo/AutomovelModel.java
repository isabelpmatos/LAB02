package com.example.demo;
	
	import javax.persistence.*;

	@Entity
	@Table(name="automoveis")
	public class AutomovelModel {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(nullable = false, unique = false, length = 20)
	    private String modelo;
	    
	    @Column(nullable = false, unique = true, length = 20)
	    private String placa;
	    
	    @Column(nullable = false, unique = false, length = 20)
	    private String marca;

	    @Column(nullable = false, unique = false, length = 20)
	    private int ano;

	    @Column(nullable = false, unique= true, length = 20)
	    private int matricula;

	    @Column(nullable = false, length = 20)
	    private double price;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

	   
	}


