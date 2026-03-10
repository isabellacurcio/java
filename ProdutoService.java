package br.unisinos.ecommerce.service;

import org.springframework.stereotype.Service;

import br.unisinos.ecommerce.repository.ProdutoRepository;
@Service
@RequiredArgsConstructor 
public class ProdutoService {
    private final ProdutoRepository produtoRepository;
    
}
