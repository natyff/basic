//package br.com.fiap.basic.entity;
//
//import br.com.fiap.basic.dto.LocadorDTO;
////import lombok.AllArgsConstructor;
////import lombok.Data;
////import lombok.NoArgsConstructor;
////
////import javax.persistence.*;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class LocadorEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
//    private UserEntity user;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_espaco", referencedColumnName = "id_espaco")
//    private EspacoEntity espaco;
//
//    @Column(name = "nome_locador")
//    private String name;
//    @Column(name = "num_cpf")
//    private Integer cpf;
//    @Column(name = "ds_endereco")
//    private String address;
//    @Column(name = "ds_tipo_local")
//    private String localType;
//    @Column(name = "ds_tamanho_local")
//    private String localSize;
//    @Column (name = "num_avaliacao")
//    private Integer rating;
//
//    public LocadorEntity (LocadorDTO locadorDTO){
//        this.id = locadorDTO.getId();
//        this.name = locadorDTO.getName();
//        this.cpf = locadorDTO.getCpf();
//        this.address = locadorDTO.getAddress();
//        this.localType = locadorDTO.getLocalType();
//        this.localSize = locadorDTO.getLocalSize();
//        this.rating = locadorDTO.getRating();
//    }
//}
