import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { CuentaBanc } from './modelo/CuentaBanc';

@Injectable({
  providedIn: 'root'
})
export class CuentasRestService {

  urlApiRest = "http://localhost:8080/cuentas";
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  constructor(private httpCli: HttpClient) { }

  public add(nuevaCuenta: CuentaBanc){
    return this.httpCli.post<CuentaBanc>(this.urlApiRest,nuevaCuenta);
  }
  public traerTodos(): Observable<CuentaBanc[]>{
    return this.httpCli.get<CuentaBanc[]>(this.urlApiRest);
  }

  public eliminar(id: Number){
    let urlPeticionDelete= `$this.urlApiRest}/${id}`;
    console.log(urlPeticionDelete);
    this.httpCli.delete(urlPeticionDelete, this.httpOptions)
    .subscribe((datos)=>{
      this.alCambiar(datos);
      console.log("eliminado " +id );
    });
  }
}
