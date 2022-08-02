package com.hilbert.api.tree;

import com.hilbert.api.reference.Reference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TreeDTO {
    private Long id;
    @NotBlank(message = "O nome da árvore/arbusto não pode ser nula/vazia")
    @Size(min = 2, max = 32, message = "Nome deve conter entre 2 e 32 caracteres")
    private String singleName;
    private String popularName;
    @Size(min = 2, max = 32, message = "Família deve conter entre 2 e 32 caracteres")
    @NotBlank(message = "A família da árvore/arbusto não pode ser nula/vazia")
    private String family;
    @Size(min = 2, max = 32, message = "Taxonomia deve conter entre 2 e 32 caracteres")
    @NotBlank(message = "Taxonomia da árvore/arbusto não pode ser nula/vazia")
    private String botanicalName;
    private String nameMeaning;
    @Size(min = 100, message = "Descrição geral deve conter no mínimo 100")
    @NotBlank(message = "A descrição geral da árvore/arbusto não pode ser nula/vazia")
    private String generalDescription;
    private String specialDescription;
    private String whereOccurs;
    private String ecologicalInfo;
    private String phenologicalInfo;
    private String propagation;
    private String managementGuide;
    private String utilities;
    private String culturalImportance;
    private Set<Reference> references = new HashSet<>();
}
