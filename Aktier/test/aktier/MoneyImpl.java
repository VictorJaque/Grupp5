/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktier;

import javax.lang.model.SourceVersion;

/**
 *
 * @author Victor Jaque <victor.jaque.mte21lin@tucsweden.se>
 */
public class MoneyImpl extends Money {
    
    private final MoneyIT outer;

    public MoneyImpl(final MoneyIT outer) {
        super(0.0F, "");
        this.outer = outer;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
    
}
