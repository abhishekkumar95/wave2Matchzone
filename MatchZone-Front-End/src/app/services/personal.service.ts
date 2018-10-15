import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";
import { Personal } from "../model/personal";
import { TokenStorage } from '../core/token.storage';
const httpOptions = {
  headers: new HttpHeaders({ "Content-type": "application/json" })
};
@Injectable({
  providedIn: 'root'
})
export class PersonalService {
  private upstreamUrl: string = "http://localhost:8091";
  private downstreamUrl: string = "http://localhost:8085";
  userId: string;
  constructor(private http: HttpClient, private token: TokenStorage) {
    this.userId = token.getUserName();
  }
  // Http call for submitting data from form
  postPersonal(personal) {
    console.log(personal);
    return this.http.post<Personal>(`${this.upstreamUrl}/api/v1/person`, personal);

  }
  // Http call for retrieving data from backend
  getPersonal() {
    return this.http.get<Personal>(`${this.downstreamUrl}/api/v1/person/` + this.userId);
  }
}
