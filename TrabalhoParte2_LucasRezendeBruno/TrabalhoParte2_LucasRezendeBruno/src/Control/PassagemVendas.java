/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.*;


/**
 *
 * @author Lucas
 */
public abstract class PassagemVendas {
        private static Venda venda;
        
        public static Venda getVenda(){
            return venda;
        }
        
        public static void setVenda (Venda venda){
            PassagemVendas.venda = venda;
        }
    
}
