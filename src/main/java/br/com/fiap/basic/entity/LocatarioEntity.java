//package br.com.fiap.basic.entity;
//
//
//import br.com.fiap.basic.dto.LocatarioDTO;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class LocatarioEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_locatario")
//    private Long id;
//
//    @Column(name = "nome_locatario")
//    private String name;
//    @Column(name = "num_cpf")
//    private Integer cpf;
//    @Column(name = "ds_endereco")
//    private String address;
//    @Column(name = "ds_objeto")
//    private String objectType;
//    @Column(name = "num_avaliacao")
//    private Integer rating;
//
//    public LocatarioEntity(LocatarioDTO locatarioDTO){
//        this.id = locatarioDTO.getId();
//        this.name = locatarioDTO.getName();
//        this.cpf = locatarioDTO.getCpf();
//        this.address = locatarioDTO.getAddress();
//        this.objectType = locatarioDTO.getObjectType();
//        this.rating = locatarioDTO.getRating();
//    }
//
//}

