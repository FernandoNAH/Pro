/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author Fer
 */
public class ArbolBinario {

    private Nodo raiz;
    private double dato;
    private double p;
    private double c;

    public ArbolBinario() {
        raiz = null;

    }
    

    public void Insertar(double num) {
        Nodo nuevo;
        nuevo = new Nodo(num);
        if (raiz == null) {
            raiz = nuevo;

        } else {
            Nodo aux = raiz;
            boolean insertado = false;

            while (insertado == false) {
                if (nuevo.Num < aux.Num) {
                    if (aux.REFI == null) {
                        aux.REFI = nuevo;
                        insertado = true;

                    } else {
                        aux = aux.REFI;
                    }
                } else {
                    if (aux.REFD == null) {
                        aux.REFD = nuevo;
                        insertado = true;

                    } else {
                        aux = aux.REFD;
                    }

                }

            }

        }

    }

    public void Mostrar_Preorden() {
        PreOrden(raiz);
    }

    private void PreOrden(Nodo aux) {
        System.out.print(aux.Num + " , ");

        if (aux.REFI != null) {
            PreOrden(aux.REFI);
        }
        if (aux.REFD != null) {
            PreOrden(aux.REFD);
        }

    }

    public void Mostrar_PostOrden() {
        PostOrden(raiz);
    }

    private void PostOrden(Nodo aux) {

        if (aux.REFI != null) {
            PostOrden(aux.REFI);
        }
        if (aux.REFD != null) {
            PostOrden(aux.REFD);
        }
        System.out.print(aux.Num + " , ");

    }

    public void Mostrar_InOrden() {
        InOrden(raiz);
    }

    private void InOrden(Nodo aux) {

        if (aux.REFI != null) {
            InOrden(aux.REFI);
        }

        System.out.print(aux.Num + " , ");

        if (aux.REFD != null) {
            InOrden(aux.REFD);
        }

    }

  /*  public double Sumar_InOrden() {
        dato = 0;

        SumarInOrden(raiz);

        return dato;

    }

    private void SumarInOrden(Nodo aux) {

        if (aux.REFI != null) {
            SumarInOrden(aux.REFI);
        }
        dato = dato + aux.Num;

        if (aux.REFD != null) {
            SumarInOrden(aux.REFD);
        }

    }

    public double Contar_InOrden() {
        dato = 0;

        ContarIntOrden(raiz);

        return dato;

    }

    private void ContarIntOrden(Nodo aux) {

        if (aux.REFI != null) {
            ContarIntOrden(aux.REFI);
        }

        dato = dato + 1;

        if (aux.REFD != null) {
            ContarIntOrden(aux.REFD);
        }

    }

    public double Promediar() {
        p = 0;

        PromediarInOrden(raiz);

        return p;
    }

    private void PromediarInOrden(Nodo aux) {

        p = Sumar_InOrden() / Contar_InOrden();

    }*/

    public double ContarHojas() {
        c = 0;

        ContarHojasInOrden(raiz);

        return c;

    }

    private void ContarHojasInOrden(Nodo aux) {

        if (aux.REFI != null) {
            ContarHojasInOrden(aux.REFI);
        }

        if (aux != null) {
            if (aux.REFI == null && aux.REFD == null) {
                c = c + 1;

            }

        }

        if (aux.REFD != null) {
            ContarHojasInOrden(aux.REFD);
        }

    }

    public double Mayor() {
        if (raiz != null) {
            Nodo reco = raiz;
            while (reco.REFD != null) {
                reco = reco.REFD;
            }
            //System.out.println("Mayor valor del árbol:" + reco.Num);

            dato = reco.Num;
        }

        return dato;

    }

}
