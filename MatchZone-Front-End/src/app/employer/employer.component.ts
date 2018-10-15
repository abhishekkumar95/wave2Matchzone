import { SearchService } from './../services/search.service';
import { Component, OnInit } from '@angular/core';
import { TokenStorage } from '../core/token.storage';
import { Result } from '../model/result';


@Component({
  selector: 'app-employer',
  templateUrl: './employer.component.html',
  styleUrls: ['./employer.component.css']
})
export class EmployerComponent implements OnInit {
  userName: string;
  userId: string;
  query:string;
  result:Result[]=[];;


  constructor(private tokenStorage: TokenStorage,private searchService:SearchService) { 
    this.userId = tokenStorage.getUserId();
    this.userName = tokenStorage.getUserName();
  }

  ngOnInit() {
  }
  onSearch(query:string){
    this.query=query;
    this.searchService.postQuery(this.query).subscribe(
      data=> { console.log(Object.keys(data).length);
        for(var i=0;i<Object.keys(data).length;i++){
           this.result[i]=data[i];
           console.log(this.result[i]);
       }
      }
    );
  }

}
