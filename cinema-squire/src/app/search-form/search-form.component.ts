import { Component, OnInit } from '@angular/core';
import { ApiClientService } from '../api-client.service';

@Component({
  selector: 'app-search-form',
  templateUrl: './search-form.component.html',
  styleUrls: ['./search-form.component.css']
})
export class SearchFormComponent implements OnInit {

  constructor(private service: ApiClientService) { }

  ngOnInit() {
  }

}
