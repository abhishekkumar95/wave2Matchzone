import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";
import { Certification } from "../model/certification";
import { TokenStorage } from '../core/token.storage';
const httpOptions = {
  headers: new HttpHeaders({ "Content-type": "application/json" })
};
@Injectable({
  providedIn: 'root'
})
export class CertificationService {

  private upstreamUrl: string = "http://localhost:8091";
  private downstreamUrl: string = "http://localhost:8085";
  userId: string;
  constructor(private http: HttpClient, private token: TokenStorage) {
    this.userId = token.getUserName();
  }
  // Http call for submitting data from form
  postCertification(certification) {
    console.log(certification);
    return this.http.post<Certification>(`${this.upstreamUrl}/api/v1/certi`, certification);

  }
  // Http call for retrieving data from backend
  getCertification() {

    return this.http.get<Certification>(`${this.downstreamUrl}/api/v1/certi/` + this.userId);

  }

}