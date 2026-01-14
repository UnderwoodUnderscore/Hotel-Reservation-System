import { useState } from 'react';
import Intro from './components/Intro';
import Form from './components/Forms';
import MainContent from './components/MainContent';
import Header from './components/Header';

export default function Page() {

	const [page, setPage] = useState('Home');

	const showLogin = false;
	const loggedIn = true;

	function handlePageChange(newPage: string) {
		setPage(newPage);
	}
	
	return (
		<>
			{showLogin && <Form type='login' />}
			{loggedIn && <Header onPageChange={handlePageChange} />}
			{loggedIn && <MainContent page={page} />}
		</>
	)
}