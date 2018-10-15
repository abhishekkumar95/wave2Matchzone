import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders,HttpErrorResponse} from "@angular/common/http";
import { map } from 'rxjs/operators';
import { debounceTime } from 'rxjs/internal/operators/debounceTime';
// const httpOptions = {
//   headers: new HttpHeaders({ "Content-type": "application/json" })
//  };

@Injectable({
 providedIn: 'root'
})
export class AutoCompletService {
 skillName:any;
 result:any;
 constructor(private http: HttpClient) { }
 private upstreamUrl: string = "http://localhost:8096";
 
 searchSkill(strvalue) {
  const listOfSkills = this.http.get(`/autocomplete/api/v1/skill/${strvalue}`)
  .pipe(
      debounceTime(500),
      map(
          (data: any) => {
              return (
                  data.length !== 0 ? data as any[] : [{'name': 'No Record Found'} as any]
              );
          }
  ));

  return listOfSkills;
}
}