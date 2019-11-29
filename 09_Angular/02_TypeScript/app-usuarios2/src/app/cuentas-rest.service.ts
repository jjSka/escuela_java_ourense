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
    this.httpCli.post<CuentaBanc>(this.urlApiRest,nuevaCuenta);
  }
}
