
/**
 *  class Test033 
 *
 * @author Mk111
 * @version 6.1.2020
 * 
 * 
 *   interpretacija naloge: besedilo, diagram, pseudo opis, 
 *   razredne metode, zagonska metoda, kontrola izvajanja ponavljanj,
 *   interpretacija izvajanja: sled izvajanja, pomen izvajane kode
 * 
 * Naloge:
 * 
 *  1. vse metode naj bodo metode razreda
 *  2. dodajte razredu zagonsko metodo
 *  3. v zagonski metodi implementirajte zaporedje aktivnosti:
 *   (start)->(parameter okolja pretvori v celostevilsko vrednost)->
 *            (s parametrom izvedi doIt_02)->
 *            (s parametrom izvedi doIt_01)->
 *   (end)
 *  4. ugotovite izpis pri : java Test033 5
 *  5. ugotovite, če program Test033 sedaj opravlja enako funkcionalnost za vse vrednosti vhodnih
 *     parametrov iz [-9..9]; če ne; ustrezno zahtevam 'popravi' program
 *  6. razložite delovanje 'programa' doIt_01/1 :
 *       - sled, interpretacija sledi, zakaj del (2*y-1), zakaj (j==y-1)?2:1, zakaj izpis y-Math.abs(j-y)
 *  7.  spremenite funkcionalnost doIt_01/1: izpis bi želeli invertirati: kjer so izpisani '-' naj se izpisujejo številke in obratno  ; sekvenca iz naloge 4 mora po popravkih
 *      izrisati simetričen lik
 *  8. izdelajte nov program, kjer bo vizualizacija doIt_01/1 in doIt_02/1 'spremenjena' tako, da bo
 *     'srednji element' po horizontali in vertikali zgolj en sam in ne podvojen, kot je v Test034
 */
public class Test033
{
    
    public void doIt_01(int y)
    {
        
        
        for(int i=0;i<y;i++){
            
            for(int j=0;j<(2*y+1);j+=(j==y-1)?2:1){
                
                if ( y-Math.abs(j-y) > i )
                  System.out.print('-');
                 else
                    System.out.print(  y-Math.abs(j-y)  );
            }
            System.out.println();
        }
        
    }
    
    
    public void doIt_02(int y)
    {
        
        
        for(int i=0;i<y;i++){
            
            for(int j=0;j<(2*y+1);j+=(j==y-1)?2:1){
                
                if ( (y-Math.abs(j-y)) < y-i-1 )
                  System.out.print('-');
                 else
                  System.out.print(  y-Math.abs(j-y)  );
            }
            System.out.println();
        }
        
    }
    
}
