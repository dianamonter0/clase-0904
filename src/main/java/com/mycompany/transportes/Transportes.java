/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author diana
 */
public class Transportes {

    public static void main(String[] args) {
        //crear un vehiculo terrestre
        VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre("Toyota", "Corolla", 4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha", "Yamaha", "Motor");
        VehiculoAereo vehiculoAereo=new VehiculoAereo("avion", "vuela", 2);
        VehiculoEspacial vehiculoEspacial=new VehiculoEspacial("nave espacial", "no hace nada", 1);

        //mostrar info de los vehículos
        System.out.println("Información del vehículo terrestre ");
        vehiculoTerrestre.mostrarInfo();
        
        System.out.println("Información del vehículo Acuático ");
        vehiculoAcuatico.mostrarInfo();

        System.out.println("Información del vehículo Aereo ");
        vehiculoAereo.mostrarInfo();

        System.out.println("Información del vehículo Espacial ");
        vehiculoEspacial.mostrarInfo();

        
    }
}
